import java.util.Scanner;

double calcularCatering(double invitados) {
    return (invitados * 25.50) + 50.00;
}

double pedirInvitados() {
    var scanner = new Scanner(System.in);
    System.out.print("Introduce el número de asistentes: ");
    return scanner.nextDouble();
}

void main() {
    System.out.println("--- Inicio del cálculo de presupuesto ---");
    var cantidadInvitados = pedirInvitados();
    var presupuestoTotal = calcularCatering(cantidadInvitados);
    System.out.printf("El presupuesto total es: %.2f €%n", presupuestoTotal);
}