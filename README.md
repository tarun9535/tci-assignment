# tci-assignment
tci-assignment



curl for get API:

curl --location 'localhost:2023/tci/employee-bonus?date=may-27-2022'



Curl for post API:

curl --location 'localhost:2023/tci/employee-bonus?date=2023%2F11%2F16' \
--header 'Content-Type: application/json' \
--data '{
    "employees": [
        {
            "empName": "raj singh",
            "department": "accounts",
            "amount": 5000,
            "currency": "INR",
            "joiningDate": "may-20-2022",
            "exitDate": "may-20-2023"
        },
        {
            "empName": "pratap m",
            "department": "accounts",
            "amount": 3000,
            "currency": "INR",
            "joiningDate": "jan-01-2021",
            "exitDate": "may-20-2023"
        },
        {
            "empName": "sushmita lal",
            "department": "IT",
            "amount": 4000,
            "currency": "INR",
            "joiningDate": "jan-01-2021",
            "exitDate": "dec-31-2021"
        },
        {
            "empName": "sam",
            "department": "Operations",
            "amount": 2500,
            "currency": "USD",
            "joiningDate": "may-20-2022",
            "exitDate": "may-20-2023"
        },
        {
            "empName": "john",
            "department": "Operations",
            "amount": 2500,
            "currency": "USD",
            "joiningDate": "jan-20-2023",
            "exitDate": "dec-30-2024"
        },
        {
            "empName": "susan",
            "department": "IT",
            "amount": 700,
            "currency": "USD",
            "joiningDate": "jan-01-2022",
            "exitDate": "dec-31-2022"
        }
    ]
}'
