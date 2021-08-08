import React from "react";
import { Button, Grid, Modal } from "@material-ui/core";
import LiveTvIcon from '@material-ui/icons/LiveTv';
import SportsEsportsIcon from '@material-ui/icons/SportsEsports';
import TransitEnterexitIcon from '@material-ui/icons/TransitEnterexit';
import { makeStyles } from '@material-ui/core/styles';
import NewGame from "./NewGame";

const useStyles = makeStyles({
    modal: {
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center'
    }
});

export const MainMenu = () => {
    const classes = useStyles();
    const [open, showNewGameModal] = React.useState(false);

    return(
        <>
        <Grid container spacing={3} direction="column"
                alignItems="center"
                justify="center"
                style={{ minHeight: '100vh' }}>
            <Grid container>
                <Grid item xs/>
                <Grid item xs={8}>
                    <Grid style={{padding:20}}>
                    <Button variant="contained" color="primary" style={{width:'100%'}} onClick={() => showNewGameModal(true)}>
                        <SportsEsportsIcon/> &nbsp; &nbsp; New Game
                    </Button>
                    </Grid>

                    <Grid style={{padding:20}}>
                    <Button variant="contained" color="primary" style={{width:'100%'}}>
                        <TransitEnterexitIcon/> &nbsp; &nbsp; Join Game
                    </Button>
                    </Grid>

                    <Grid style={{padding:20}}>
                    <Button variant="contained" color="primary" style={{width:'100%'}}>
                        <LiveTvIcon/> &nbsp; &nbsp; Live Score
                    </Button>
                    </Grid>
                </Grid>
                <Grid item xs/>

            </Grid>
        </Grid>



        <Modal open={open} onClose={() => showNewGameModal(false)}  className={classes.modal}
        aria-labelledby="simple-modal-title" aria-describedby="simple-modal-description">
            <NewGame/>
        </Modal>
        </>
    );
}