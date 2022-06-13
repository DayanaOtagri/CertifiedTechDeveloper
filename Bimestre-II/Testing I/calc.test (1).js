/* const { describe } = require('yargs'); */
const { suma, resta, multiplicacion, division } = require("../calc.js");

describe("Pruebas suma", () => {
  test("Suma de 2 numeros", () => {
    expect(suma(1, 2)).toBe(3);
  });
  test("Suma de null ", () => {
    expect(suma(null, null)).toBe(0);
  });
  test("Suma de caracteres", () => {
    expect(suma("a", "b")).toBe(0);
  });
});

describe("Pruebas de resta", () => {
  test("Resta de 2 numeros", () => {
    expect(resta(1, 2)).toBe(-1);
  });
  test("Resta de null", () => {
    expect(resta(null, null)).toBe(0);
  });
  test("Resta de caracteres", () => {
    expect(resta("a", "b")).toBe(0);
  });
});

describe("Pruebas de multiplicacion", () => {
  test("Multiplicación de 2 numeros", () => {
    expect(multiplicacion(5, 2)).toBe(10);
  });
  test("Multiplicación de null ", () => {
    expect(multiplicacion(null, null)).toBe(0);
  });
  test("Multiplicación de caracteres", () => {
    expect(multiplicacion("a", "b")).toBe(0);
  });
});

describe("Pruebas de división", () => {
  test("División de 2 numeros", () => {
    expect(division(10, 2)).toBe(5);
  });
  test("División de null ", () => {
    expect(division(null, null)).toBe(0);
  });
  test("División de caracteres", () => {
    expect(division("a", "b")).toBe(0);
  });
});
