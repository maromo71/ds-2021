package net.maromo.exemplo2907;

public class GerenciarEscola {

    public static void main(String[] args) {
        //Cadastrar 03 alunos, matricular dois apenas. Mostrar os dados
        //dos dois alunos, matricular um terceiro, logo em seguida
        //cancelar a matrícula deste terceiro.

        Aluno aluno1, aluno2, aluno3;
        //Instanciar e alimentar dos dados do aluno
        aluno1 = new Aluno();
        aluno1.rm = "123";
        aluno1.nome = "Ricardo";
        aluno1.turma = "Informática para Internet";
        aluno1.email = "ricardo.lopes@gmail.com";

        aluno2 = new Aluno();
        aluno2.rm = "234";
        aluno2.nome = "José Roberto";
        aluno2.turma = "Informática para Internet";
        aluno2.email = "jose@gmail.com";

        aluno3 = new Aluno();
        aluno3.rm = "345";
        aluno3.nome = "Maria Eunice";
        aluno3.turma = "Desenvolvimento de Sistemas";
        aluno3.email = "maria@gmail.com";

        aluno1.matricular();
        aluno2.matricular();

        aluno1.apresentarDados();
        aluno2.apresentarDados();

        aluno3.matricular();
        aluno3.cancelarMatricula();
    }
}
