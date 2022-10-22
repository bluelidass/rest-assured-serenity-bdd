Feature: Create User

    @case=createUser
    Scenario: Success to create user
        Given a "female" user with status to "active"
        When send request to create the user
        Then the response status code is 201

    @case=failedCreateUser
    Scenario: Failed to create user without auth token
        Given a "male" user with status to "active"
        When send request to create the user without auth token
        Then the response status code is 401
        Then the response message is "Authentication failed"

    @case=failedCreateUser
    Scenario: Failed to create user with empty payload
        When send request to create user with empty payload
        Then the response status code is 422
        Then the message properties are can't be blank

    @case=failedCreateUser
    Scenario: Failed to create user without name
        Given a "male" user with status to "active"
        When send request to create user without name
        Then the response status code is 422
        Then the "name" field contains message to "can't be blank"
