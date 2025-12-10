import React from 'react';
import PropTypes from 'prop-types';
import Cookies from 'universal-cookie';
import { connect } from 'react-redux';
import { Redirect } from 'react-router';
import PreloaderIcon from 'react-preloader-icon';
import Puff from 'react-preloader-icon/loaders/Puff';
import {
  signInCheckJWT,
  signInValidJWT,
  signInInvalidJWT,
  logOut,
  signInGoBackIfSucc
} from '../SignIn/actions';

export default (Component) => {
  /**
   * Checks if user is NOT authorized. If he is NOT authorized, it allows him to open guests page. Otherwise it does redirect to home page.
   * @memberof module:PermissionChecker
   */
  class OnlyGuests extends React.Component {
    componentDidMount() {
      const
        {
          signInCheckJWT: signIn, signInInvalidJWT: signInInv,
          verifyingJWT
        } = this.props;

      const cookies = new Cookies();

      const jwt = cookies.get('jwt');
      if (jwt && jwt !== '') {
        if (verifyingJWT) signIn();
      } else {
        signInInv();
      }
    }

    render() {
      const
        {
          user,
          verifyingJWT
        } = this.props;

      if (verifyingJWT) {
        return (
          <div className="mainPreLoaderParent">
            <div className="mainPreLoader">
              <PreloaderIcon
                loader={Puff}
                size={70}
                strokeWidth={15}
                strokeColor="#f7bd27"
                duration={800}
              />
            </div>
          </div>
        );
      }

      if (user) {
        return (
          <Redirect to="/" />
        );
      }
      return (
        <Component {...this.props} />
      );
    }
  }

  OnlyGuests.propTypes = {
    signInCheckJWT: PropTypes.func.isRequired,
    signInInvalidJWT: PropTypes.func.isRequired
  };

  const mapStateToProps = (state) => ({
    user: state.signIn.user,
    verifyingJWT: state.signIn.verifyingJWT
  });
  return (
    connect(
      mapStateToProps,
      { signInCheckJWT, signInValidJWT, signInInvalidJWT }
    )(OnlyGuests)
  );
};
