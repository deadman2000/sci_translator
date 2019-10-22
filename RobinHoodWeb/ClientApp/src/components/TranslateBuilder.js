import React, { Component } from 'react';
import { ButtonToolbar, Button, ProgressBar } from 'react-bootstrap';

export class TranslateBuilder extends Component {
    static displayName = TranslateBuilder.name;

    URL = 'ws://' + window.location.host + '/translate';
    client = new WebSocket(this.URL);

    state = {
        connecting: true,
        building: false
    };

    componentWillMount() {
        this.client.onopen = () => {
            this.setState({ connecting: false });
        };

        this.client.onmessage = ({ data }) => {
            const state = JSON.parse(data);
            console.log(state);
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
                <h1>Conquests of the Longbow: The Legend of Robin Hood</h1>
                <p>Текущий перевод: {update_date || "нет"} {update_date && <a href="/download/CONQUESTS.ZIP">Скачать</a> }</p>
                {building && <p><ProgressBar now={progress} /></p>}
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
