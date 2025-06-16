# Multi-Currency Money Calculator

## Objective

Implement a simple Java library to evaluate expressions involving money in multiple currencies. The goal is to design a clean, testable system using TDD (Test-Driven Development).

---

## Requirements

You need to implement the following classes:

### `Money`

- Represents a monetary amount and its currency (e.g. `10 USD`).
- Must:
  - Store an amount (`double`) and currency (`String`).
  - Convert to another currency using a `CurrencyConverter`.
  - Add another `Money` instance, converting to a common currency if needed.

### `CurrencyConverter`

- Accepts a fixed map of currency-to-USD rates (e.g. `EUR -> 1.2`, `GBP -> 1.5`).
- Must:
  - Convert an amount from one currency to another using rates provided.

### `MoneyCalculator`

- Parses and evaluates expressions like `"10USD + 20EUR"` and returns the result in a target currency (default is USD).
- Must:
  - Support simple expressions with `+`.
  - Be able to handle different currencies.
  - Allow specifying the target currency for the result.

---

## Example Usage

```java
CurrencyConverter converter = new CurrencyConverter(Map.of(
    "USD", 1.0,
    "EUR", 1.2,
    "GBP", 1.5
));

MoneyCalculator calc = new MoneyCalculator(converter);

calc.evaluate("10USD + 20USD");          // 30.0
calc.evaluate("10USD + 20EUR");          // 34.0
calc.evaluate("10EUR + 20USD", "EUR");   // ~26.66 EUR
