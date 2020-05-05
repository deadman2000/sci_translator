import React, { Component } from 'react';
import { Table } from 'react-bootstrap';
import axios from 'axios';

function AnalysisRow(props) {
    const { res } = props

    return (
        <tr>
            <td>{res.res} : {res.index}</td>
            <td>
                {!!res.notaLink && (<a href={"http://notabenoid.org" + res.notaLink} target="_blank"><img src="/notabenoid.png" /></a>)}
            </td>
            <td>
                <a href={res.url} target="_blank">
                    <div style={{
                        backgroundImage: `url(https://translate.ml.ask-glonass.ru${res.image})`,
                        width: 160,
                        height: 120,
                        backgroundRepeat: 'no-repeat',
                        backgroundSize: "160px 120px"
                    }}>
                    </div>
                </a>
            </td>
            <td>{res.en}</td>
            <td>{res.score}</td>
            <td>{res.videoId} time={res.time}</td>
            <td>{res.txt}</td>
        </tr>
    )
}

export default class Analysis extends Component {
    state = {
        rows: []
    }

    componentDidMount() {
        axios.get(`/api/analysis`)
            .then(r => this.setState({ rows: r.data }))
    }

    render() {
        const { rows } = this.state

        return (
            <Table>
                <tbody>
                    {rows.map((r, i) => (
                        <AnalysisRow key={i} res={r} />
                    ))}
                </tbody>
            </Table>
        )
    }
}