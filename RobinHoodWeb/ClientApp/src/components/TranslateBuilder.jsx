import React, { Component } from 'react';
import { ButtonToolbar, Button, ProgressBar } from 'react-bootstrap';

function ws_protocol() {
    if (window.location.protocol === "https:")
        return 'wss://';
    return 'ws://';
}

export class TranslateBuilder extends Component {
    static displayName = TranslateBuilder.name;

    URL = ws_protocol() + window.location.host + '/api/translate';
    client = new WebSocket(this.URL);

    state = {
        connecting: true,
        building: false,
        progress: 0
    };

    componentWillMount() {
        this.client.onopen = () => {
            this.setState({ connecting: false });
        };

        this.client.onmessage = ({ data }) => {
            const state = JSON.parse(data);
            this.setState(state);
        };

        this.client.onclose = () => {
            this.setState({ connecting: true });
            this.client = new WebSocket(this.URL);
        };
    }

    componentWillUnmount() {
        this.client.onclose = null;
        this.client.close();
    }

    render() {
        const { connecting, building, progress, update_date } = this.state;
        return (
            <div>
                <p>Текущий перевод: {update_date || "нет"} {update_date && <a href="/download/CONQUESTS.ZIP">Скачать</a> }</p>
                {building && <div><ProgressBar now={progress} /></div>}
                <ButtonToolbar>
                    <Button variant="primary"
                        disabled={connecting || building}
                        onClick={() => this.build()}>СОБРАТЬ</Button>
                </ButtonToolbar>
            </div>
        );
    }

    build() {
        this.setState({ building: true });
        this.client.send("build");
    }
}
