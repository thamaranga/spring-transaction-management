# spring-transaction-management

This sample spring boot rest api demonstrates spring data jpa
transaction handling.

This sample has two entities as Patient and Appointment. While saving
data it validates promocode. If  we are providing an invalid promocode then 
any of the Patient,Appointment data will not be saved.