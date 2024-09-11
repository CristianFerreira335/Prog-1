
    public class EmpregadoTeste {
        public static void main(String[] args) {
        
            Empregado[] empregados = new Empregado[2];
    
        
            empregados[0] = new Empregado();
            empregados[0].setNome("João");
            empregados[0].setSobrenome("Silva");
            empregados[0].setSalarioMensal(2500.00);
    
            empregados[1] = new Empregado();
            empregados[1].setNome("Maria");
            empregados[1].setSobrenome("Oliveira");
            empregados[1].setSalarioMensal(3000.00);

            System.out.println("Salario anual antes del aumento:");
            for (Empregado empregado : empregados) {
                System.out.println(empregado.getNome() + " " + empregado.getSobrenome() + ": " + empregado.getSalarioAnual());
            }
    
            for (Empregado empregado : empregados) {
                empregado.aumentarSalario();
            }
    
            System.out.println("\nSalario anual después del aumento:");
            for (Empregado empregado : empregados) {
                System.out.println(empregado.getNome() + " " + empregado.getSobrenome() + ": " + empregado.getSalarioAnual());
            }
        }
    }
    

