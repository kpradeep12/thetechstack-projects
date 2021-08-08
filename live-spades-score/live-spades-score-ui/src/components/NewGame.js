import { makeStyles } from '@material-ui/core'
import React from 'react'
import Players from './Players';

const useStyles = makeStyles((theme) => ({
    paper: {
        position: 'absolute',
        width: 400,
        backgroundColor: theme.palette.background.paper,
        border: '2px solid #000',
        boxShadow: theme.shadows[5],
        padding: theme.spacing(2, 4, 3)
    }
}));
export default function NewGame() {
    const classes = useStyles();
    return (
        <div  className={classes.paper}>
            <h2 id="simple-modal-title">Add Players</h2>
            <Players/>
            </div>
    )
}
