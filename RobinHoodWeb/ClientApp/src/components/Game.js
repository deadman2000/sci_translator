import React, { useRef, useEffect } from 'react';
import './Game.css';

require("js-dos"); 

export default function Game() {
    const ref = useRef(null);

    useEffect(() => {
        if (ref !== null) {
            const ciPromise = window.Dos(ref.current, {
                wdosboxUrl: "https://js-dos.com/6.22/current/wdosbox.js",
                autolock: true,
                cycles: "max"
            }).then(({ fs, main }) => {
                return fs.extract("/download/CONQUESTS.ZIP", "/conquest").then(() => {
                    return main(["-c", "cd conquest", "-c", "SCIDHUV.EXE"]); // ["-c", "DIR"] SCIDHUV.EXE
                });
            });

            return () => {
                ciPromise.then(ci => ci.exit());
            };
        }
    }, [ref]);

    return <canvas ref={ref} />;
}