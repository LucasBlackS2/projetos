package desafios.POO;

import java.util.Scanner;

public class JogoDaForca {
    private String[] JogoDaForca={"frutas", "animais", "cores", "objetos", "profissões"};
    private String[] Items={"cadeira", "mesa", "computador", "celular", "livro"};
    private String[] Frutas={"banana", "abacaxi", "laranja", "morango", "uva"};
    private String[] Animais={"cachorro", "gato", "elefante", "leão", "tigre"};
    private String[] Cores={"vermelho", "azul", "verde", "amarelo", "roxo"};
    private String[] Objetos={"cadeira", "mesa", "computador", "celular", "livro"};
    private String[] Profissoes={"médico", "engenheiro", "professor", "advogado", "arquiteto"};

            public void imprimirItens () {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Escolha um tema: ");
                for (int i = 0; i < JogoDaForca.length; i++) {
                    System.out.println( "-" +JogoDaForca[i]+"\n");
                }

                    String escolha = scanner.nextLine().toLowerCase();
                    System.out.println("Você escolheu: " + escolha);

                if (escolha.equals("items") && Items.length > 0) {
                    String escolhaItem = Items[(int) (Math.random() * Items.length)];
                    String novaPalavra = escolhaItem.replaceAll("[a,e,i,o,u]", " ");
                    System.out.println("Palavra com letras removidas: " + novaPalavra + " - " + novaPalavra.length() + " letras");
                    System.out.println("Digite a palavra que você acha que é: ");
                    String escolha2 = scanner.nextLine().toLowerCase();
                    if (escolha2.equals(escolhaItem)) {
                        System.out.println("Parabéns! Você acertou.");
                    } else {
                        System.out.println("Que pena! Você errou.");
                    }
                    System.out.println("Sua palavra: " + escolha2 + " - Palavra verdadeira: " + escolhaItem);
                }

                else if (escolha.equals("frutas") && Frutas.length >0){
                    String escolhaFruta = Frutas[(int) (Math.random() * Frutas.length)];
                    String novaPalavra = escolhaFruta.replaceAll("[a,e,i,o,u]", " ");
                    System.out.println("Palavra com letras removidas: "+novaPalavra + " - " + novaPalavra.length() + " letras");
                    System.out.println("Digite a palavra que você acha que é: ");
                    String escolha2 = scanner.nextLine().toLowerCase();
                    if (escolha2.equals(escolhaFruta)) {
                        System.out.println("Parabéns! Você acertou.");
                    } else {
                        System.out.println("Que pena! Você errou.");
                    }
                    System.out.println("Sua palavra: " + escolha2 + " - Palavra verdadeira: " + escolhaFruta);
                }

                else if (escolha.equals("animais") && Animais.length > 0) {
                    String escolhaAnimal = Animais[(int) (Math.random() * Animais.length)];
                    String novaPalavra = escolhaAnimal.replaceAll("[a,e,i,o,u]", " ");
                    System.out.println("Palavra com letras removidas: "+novaPalavra + " - " + novaPalavra.length() + " letras");
                    System.out.println("Digite a palavra que você acha que é: ");
                    String escolha2 = scanner.nextLine().toLowerCase();
                    if (escolha2.equals(escolhaAnimal)) {
                        System.out.println("Parabéns! Você acertou.");
                    } else {
                        System.out.println("Que pena! Você errou.");
                    }
                    System.out.println("Sua palavra: " + escolha2 + " - Palavra verdadeira: " + escolhaAnimal);
                }

                else if (escolha.equals("cores") && Cores.length > 0) {
                    String escolhaCor = Cores[(int) (Math.random() * Cores.length)];
                    String novaPalavra = escolhaCor.replaceAll("[a,e,i,o,u]", " ");
                    System.out.println("Palavra com letras removidas: "+novaPalavra + " - " + novaPalavra.length() + " letras");
                    System.out.println("Digite a palavra que você acha que é: ");
                    String escolha2 = scanner.nextLine().toLowerCase();
                    if (escolha2.equals(escolhaCor)) {
                        System.out.println("Parabéns! Você acertou.");
                    } else {
                        System.out.println("Que pena! Você errou.");
                    }
                    System.out.println("Sua palavra: " + escolha2 + " - Palavra verdadeira: " + escolhaCor);
                }

                else if (escolha.equals("objetos") && Objetos.length > 0) {
                    String escolhaObjeto = Objetos[(int) (Math.random() * Objetos.length)];
                    String novaPalavra = escolhaObjeto.replaceAll("[a,e,i,o,u]", " ");
                    System.out.println("Palavra com letras removidas: "+novaPalavra + " - " + novaPalavra.length() + " letras");
                    System.out.println("Digite a palavra que você acha que é: ");
                    String escolha2 = scanner.nextLine().toLowerCase();
                    if (escolha2.equals(escolhaObjeto)) {
                        System.out.println("Parabéns! Você acertou.");
                    } else {
                        System.out.println("Que pena! Você errou.");
                    }
                    System.out.println("Sua palavra: " + escolha2 + " - Palavra verdadeira: " + escolhaObjeto);
                }

                else if (escolha.equals("profissoes") && Profissoes.length > 0) {
                    String escolhaProfissao = Profissoes[(int) (Math.random() * Profissoes.length)];
                    String novaPalavra = escolhaProfissao.replaceAll("[a,e,i,o,u]", " ");
                    System.out.println("Palavra com letras removidas: "+novaPalavra + " - " + novaPalavra.length() + " letras");
                    System.out.println("Digite a palavra que você acha que é: ");
                    String escolha2 = scanner.nextLine().toLowerCase();
                    if (escolha2.equals(escolhaProfissao)) {
                        System.out.println("Parabéns! Você acertou.");
                    } else {
                        System.out.println("Que pena! Você errou.");
                    }
                    System.out.println("Sua palavra: " + escolha2 + " - Palavra verdadeira: " + escolhaProfissao);
                }

                else {
                    System.out.println("Nenhum item ou tema disponível.");
                }
            }
        }

