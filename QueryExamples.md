![http://omtt.googlecode.com/svn/wiki/images/enterprise-diagram.jpg](http://omtt.googlecode.com/svn/wiki/images/enterprise-diagram.jpg)


**queries.omtt**:
```
// we will use classes (declared in Java), ilustrated on the diagram
%% import pl.omtt.samples.enterprise-model._

// testQueries gets a Company as an argument and puts it into context
% def testQueries [Company]
  // list names of all main departments
  { departments.name }

  // list all of the employees
  { employees }

  // find director of IT department
  { employees.Director[department.name == 'IT'] }

  // or, what is the same (where operator has lower priority):
  { employees.Director where department.name == 'IT' }

  // find directors that earn less money than any of their employees
  {
    employees.Director as d
    where
      not empty (employees where department == d.department && salary > d.salary)
  }

  // find all managers living and working in different cities
  {
    employees.Manager
    where
      address.city != department.address.city
  }
% end
```