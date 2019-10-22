import React, { Component } from 'react';
import { Route } from 'react-router';
import { Layout } from './components/Layout';
import { TranslateBuilder } from './components/TranslateBuilder';

import './custom.css'

export default class App extends Component {
    static displayName = App.name;

    render() {
        return (
            <Layout>
                <Route exact path='/' component={TranslateBuilder} />
            </Layout>
        );
    }
}
