![http://omtt.googlecode.com/svn/wiki/images/enterprise-diagram.jpg](http://omtt.googlecode.com/svn/wiki/images/enterprise-diagram.jpg)


**dataManipulation.omtt**
```
%% import pl.omtt.samples.enterprise-model._

// simple template transformating sequence into HTML list
% def html_list items*
  <ul>
  { items map "<li>{_}</li>" }
  </ul>
% end

% def test [Company]
  // list all the employees as HTML list
  { employees | html_list }

  // or - what is exactly the same
  { employees apply html_list }

  // show main departments with number of their employees as HTML list
  {
    departments as d
    map
      "<b>{name}</b>: {count employees[department == d]} employees"
    apply
      html_list
  }

  // list all teams with their participants
  // managers should be bolded
  % map employees.Manager.team as t
    <h3>Team: {number}</h3>
    { employees[team == t] as emp
      map
        if emp.Manager: "<b>{emp}</b>" else: emp
      apply
        html_list
    }
  % end
% end
```