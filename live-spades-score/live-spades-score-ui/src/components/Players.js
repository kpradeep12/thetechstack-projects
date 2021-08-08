import React from 'react'
import { TextField, IconButton } from '@material-ui/core'
import AddCircleIcon from '@material-ui/icons/AddCircle';
import InputAdornment from '@material-ui/core/InputAdornment';
import AccountCircle from '@material-ui/icons/AccountCircle'

export default function Players() {
    return (
        <>
            <TextField id="standard-basic" placeholder="Add Player" InputProps={{}}/>
            <IconButton color="primary" aria-label="Add Player" component="span">
            <AddCircleIcon />
            </IconButton>
        </>
    )
}
