# CurrencyConvertor
Simple CLI Currency Convertor using rates via API

## Runner
Initialises the program by starting the menu.

## Menu
Simple menu to guide user input. Requests currency to convert *from* and *to* and the *amount*. 

## Currency Convertor
Takes user input and runs it through API Layers exchange rate. https://api.apilayer.com/exchangerates_data You will need to generate your own API Key and include it in your program.
Returns the converted amount and prints it to the console.

### Dependencies
JSON-java org.json - Required for parsing https://github.com/stleary/JSON-java
