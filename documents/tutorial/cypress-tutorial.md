# Cypress Tutorial

## Create a cypress project

```bash
mkdir cypress-tutorial && cd $_
npm init -y
```

## Install cypress in your new project folder

```bash
npm i cypress --save-dev
```

## Run Cypress

```bash
node_modules/.bin/cypress open
```

## Create own test

```bash
touch cypress/integration/firstTest.js
```

## Add test contents

```bash
describe('My First Test', function() {
  it('Search on google', function() {
    cy.viewport(1440, 1200);
    cy.visit('http://www.google.com/ncr');
    cy.title().should('eq', 'Google');
    // cy.get('.gLFyf').type('cypress{enter}');
    // cy.get('name="q"').type('cypress{enter}');
    cy.get('input[name="q"]').type('cypress{enter}');
    cy.title().should('eq', 'cypress - Google Search');
  });
});
```

## Add second test

```bash
touch cypress/integration/secondTest.js
```

```bash
describe("My Second Test", function() {
  it("Search on amazon", function() {
    cy.viewport(1440, 1200);
    cy.visit("https://www.amazon.com/");
    cy.get("#twotabsearchtextbox").type("Superman");
    cy.get(".nav-search-submit .nav-input").click();
    cy.get("span.a-color-state").contains("Superman");
  });
});
```

https://www.swtestacademy.com/cypress-tutorial/
https://www.valentinog.com/blog/cypress/
