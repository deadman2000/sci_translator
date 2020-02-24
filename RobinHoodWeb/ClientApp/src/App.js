import React, { Component } from 'react';
import {
    Switch,
    Route,
} from "react-router-dom";

import './custom.css'
import Home from './components/Home';
import Game from './components/Game';

export default class App extends Component {
    static displayName = App.name;

    render() {
        return (
            <Switch>
                <Route exact path="/" component={Home} />
                <Route path="/game" component={Game} />
            </Switch>
        );
    }
}
