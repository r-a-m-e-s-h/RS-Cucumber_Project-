Feature: Search and Place order for the product

@SearchProduct
Scenario Outline: Search product experience in home page and offers page
Given user is on GreenKart Landing Page
When User Search the product with shortName <VegName> and extract the actual name of the product
Then User search the product in the offers page with shortName <VegName> to check if exist  
And check both both the productNames are same and close the browser

Examples:
|	VegName	|
|	Tom	|
|	Beet	|
