import './App.css';
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom';
import {MainMenu} from './components/MainMenu';
import Players from './components/Players';

function App() {
  return (
    <>
      <Router>
        <Switch>
          <Route path="/" exact>
            
            <Players/>
          </Route>
        </Switch>
      </Router>
    </>
  );
}

export default App;