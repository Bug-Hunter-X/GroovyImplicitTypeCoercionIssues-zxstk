# Groovy Implicit Type Coercion Issue

This repository demonstrates a common Groovy error related to implicit type coercion causing a `MissingMethodException`.  The issue highlights the importance of explicit type declaration in function parameters when dealing with lists.

## Problem

The `mySum` function in `bug.groovy` attempts to sum the elements of a list. However, due to the lack of explicit type declaration for the list parameter, Groovy's implicit type coercion fails, resulting in a `MissingMethodException`.

## Solution

The `bugSolution.groovy` file provides a corrected version of `mySum`, explicitly defining the parameter type as `List`. This resolves the type mismatch and allows the function to correctly sum the list elements.

## How to Reproduce

1. Clone this repository.
2. Run `bug.groovy`. Observe the `MissingMethodException`.
3. Run `bugSolution.groovy`. Observe the correct sum being printed.