Feature: List Users

    @case=getListUsers
    Scenario: Success to get list users
        When send request to get list users
        Then the response status code is 200