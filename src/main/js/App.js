import React from 'react';
import EmployeeList from './EmployeeList'
import client from 'rest';

class App extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            employees: []
        };
    }
    componentDidMount() {
        client({
            method:'GET', path:'/api/employees'
        }).done(response => {
            const jsonOutput = JSON.parse(response.entity);
            this.setState({employees: jsonOutput._embedded.employees});
        });
    }

    render() {
        return (
            <div>
                <EmployeeList employees={this.state.employees}/>
            </div>
        );
    }
}
export default App;