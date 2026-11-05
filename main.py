def calcular_catering(invitados: float) -> float:
    return (invitados * 25.50) + 50.00

def pedir_invitados() -> float:
    entrada = input("Introduce el número de asistentes: ")
    return float(entrada)

# Flujo principal
print("--- Inicio del cálculo de presupuesto ---")
cantidad_invitados = pedir_invitados()
presupuesto_total = calcular_catering(cantidad_invitados)
print(f"El presupuesto total es: {presupuesto_total:.2f} €")