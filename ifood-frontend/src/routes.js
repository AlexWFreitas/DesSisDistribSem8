import React from 'react';
import LandingPage from './pages/LandingPage';
import Dashboard from './pages/Dashboard';
import { BrowserRouter, Route } from 'react-router-dom';

function Routes() {
	return (
		<BrowserRouter>
			<Route exact path="/" component={LandingPage} />	
			<Route path="/dashboard" component={Dashboard} />
		</BrowserRouter>
	)
}

export default Routes;