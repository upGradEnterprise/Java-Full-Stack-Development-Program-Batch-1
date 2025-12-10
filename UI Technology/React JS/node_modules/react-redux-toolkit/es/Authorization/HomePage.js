import React from 'react';
import { Redirect } from 'react-router';

/**
 * Redirects to home page, depended on role type
 * @memberof module:PermissionChecker
 */
const HomePage = () => {
  return (
    <Redirect to="/projects/" />
  );
};

export default HomePage;
