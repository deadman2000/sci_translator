import React from 'react';

export default function VideosList(props) {
    return <>{props.videos.map((v, i) =>
        <a href={v.url} target="_blank" className="video_preview" key={i}>
            <div style={{ backgroundImage: `url(${v.image})` }}>
                <span>{Math.round(v.score * 10) / 10}</span>
            </div>
        </a>
    )}</>
}
