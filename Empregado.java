public class Empregado {

        private String nome;
        private String sobrenome;
        private double salarioMensal;
    
        // Métodos get y set para nombre
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        // Métodos get y set para apellido
        public String getSobrenome() {
            return sobrenome;
        }
    
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }
    
        // Métodos get y set para salario mensual
        public double getSalarioMensal() {
            return salarioMensal;
        }
    
        public void setSalarioMensal(double salarioMensal) {
            this.salarioMensal = salarioMensal;
        }
    
        // Método para calcular el salario anual
        public double getSalarioAnual() {
            return salarioMensal * 12;
        }
    
        // Método para aumentar el salario en 10%
        public void aumentarSalario() {
            salarioMensal = salarioMensal * 1.10;
        }
    }
    

