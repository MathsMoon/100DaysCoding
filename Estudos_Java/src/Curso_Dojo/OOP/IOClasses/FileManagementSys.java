package Curso_Dojo.OOP.IOClasses;

public class FileManagementSys {

    /*
        Depois arruma o código para utilizar como um Sistema Simples de
        Gerenciamento de Arquivos



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao Sistema de Arquivos, o que deseja fazer?");
        System.out.println("1- Criar um Arquivo\n2- Consultar um Arquivo\n3-Deletar um Arquivo");
        int op = Integer.parseInt(scan.nextLine());

        switch (op){
            case 1:
                CreatingFile(scan);
                break;
            case 2:
                IsFileExist(scan);
                break;
            case 3:
                DeletingFile(scan);
                break;
        }
    }

    private static void IsFileExist(Scanner scan) {

        if(file.exists()){
            System.out.println("Arquivo já Existe:");
            FileInfo(file);
        } else {
            System.out.println("Arquivo não existe");
        }
    }

    private static void FileInfo(Scanner scan) {

        System.out.println("Path: "+ file.getAbsolutePath());
        System.out.println("É um Arquivo? "+ file.isFile());
        System.out.println("Está oculto? "+ file.isHidden());
        System.out.println("Última modificação: "+ new Date(file.lastModified()));
    }

    private static void DeletingFile(File file) {
        boolean isDeleted = file.delete();
        if(file.exists()){
            System.out.println("Arquivo Não foi Deletado");
        } else {
            System.out.println("Arquivo Deletado: "+ isDeleted);
        }
    }

    private static void CreatingFile(Scanner scan) {
        System.out.println("Digite o nome do Arquivo: ");
        String filename = scan.nextLine();
        File file = new File(filename);
        boolean newFile = false;

        try {
            newFile = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Arquivo Criado? "+ newFile);
    }

     */
}
