import React from 'react';
import Cookies from 'universal-cookie';
import { connect } from 'react-redux';
import { push } from 'react-router-redux';
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

export default (Component, props) => {
  /**
   * Checks if user is authorized. If he is authorized and his role type has permission to visit current page, it renders the page. Otherwise it does redirect him to login page.
   * @memberof module:PermissionChecker
   */
  class ProtectedRoute extends React.Component {
    componentDidMount() {
      const {
        signInCheckJWT: signIn,
        signInInvalidJWT: signInInv,
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
      const {
        user,
        verifyingJWT,
        signInGoBackIfSucc: needGoBackAfterLogin
      } = this.props;

      if (verifyingJWT) {
        return (
          <div className="mainPreLoaderParent">
            <div className="mainPreLoader">
              <PreloaderIcon
                loader={Puff}
                size={70}
                strokeWidth={15}
                strokeColor="#2196f3"
                duration={800}
              />
            </div>
          </div>
        );
      }

      if (user) {
        return <Component {...this.props} {...props} myRoleType={user.role.type} myUserID={user._id} />;
      }
      needGoBackAfterLogin(true);
      return <Redirect push to="/signin" />;
    }
  }

  const mapStateToProps = (state) => ({
    user: state.signIn.user,
    verifyingJWT: state.signIn.verifyingJWT
  });
  return (
    connect(
      mapStateToProps,
      {
        signInCheckJWT,
        signInValidJWT,
        signInInvalidJWT,
        logOut,
        push,
        signInGoBackIfSucc
      }
    )(ProtectedRoute)
  );
};
