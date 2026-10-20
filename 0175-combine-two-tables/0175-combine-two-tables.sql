# Write your MySQL query statement below
select Person.firstName,person.lastName,Address.city,Address.state
from Person
Left Join Address
ON Person.personId = Address.personId;