import React, { Component } from 'react';
import VideosList from './VideosList';

export default class TranslateRow extends Component {
    render() {
        const { res } = this.props

        return (
            <tr>
                <td>{res.index}</td>
                <td>
                    {!!res.notaLink && (<a href={"http://notabenoid.org" + res.notaLink} target="_blank"><img src="/notabenoid.png" /></a>)}
                </td>
                <td>{res.en}</td>
                <td>{res.tr}</td>
                <td>
                    {res.videos && <VideosList videos={res.videos} />}
                </td>
            </tr>
        )
    }
}
