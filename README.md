# POO

## **Projeto da disciplina de Programação Orientada a Objetos em JAVA**

**Alunos:** Nathan Pereira Gomes de Sousa, José Rayff Crispim dos Santos
**Tema:**  Game em turnos

[GitHub](https://github.com/nathanGsousa/POO)

Este projeto é a oportunidade de conectar tudo o que aprendemos até aqui: desde os conceitos básicos até estruturas mais complexas como
herança, polimorfismo, interfaces e coleções. É hora de mostrar que você consegue pensar como desenvolvedor(a), construir algo funcional e explicá-lo com clareza.

Funcionalidades sugeridas:

1. Que desenvolva um programa que demonstre domínio dos princípios da POO, integrando os tópicos estudados;

2. Que use criatividade, organização e clareza na construção da solução;

3. Que seja capaz de comunicar sua lógica e suas decisões técnicas, tanto por meio da apresentação quanto na documentação; -> **Uso do módelo UML**

4. Que trabalhe com responsabilidade e colaboração. -> **Uso de Git e GitHub**

Entrega:

1. Apresentação Técnica com Slides
**Explicação da estrutura do projeto, principais classes etc.**

2. Demonstração Prática
**Executar o programa mostrando as funcionalidades principais.**
**Justificar uso de herança, interface, coleções etc.**

## Entrega

>[Slide](https://www.canva.com/design/DAGoviRN50Y/qy6uJJ2ZEOc6eMEgncOqgA/edit?utm_content=DAGoviRN50Y&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

## **Nosso projeto:**

### Especificações

Jogo de turno simples
**Descrição:** Um jogo com o objetivo de uma bela ilustração e muita diversão para o jogador(a), Com uma facil jogabilidades, facil entendimento, e claro Muitas lutas, seja Bem vindo ao GAME.
Um jogo de turno, de combate feito totalmente para ser usado pelo terminal...

> **Herança:**

- Classes -> Melee, Longdistance, Tank

> **Polimorfismo:**

- mensagem -> Cada classe como Melee, Tank e LongDistance apresentam um método mensagem() diferente.

> **Encapsulamneto:**

- **Player** e **NPC** possuim de atributo a classe Classes, que garantem a funcionalidade deles dentro do jogo.
- **Game** nessa classe o funcionamento e o jogo é gerenciado, as possíveis movimentações e os turnos do jogo é aqui controlado, possui os atributos Player e NPC, para onde eles se enontram e jogam um contra o outro.

> **Interface:**

- Combate -> Classes:
    // Retorna o nome da arma equipada
    String getNomeArma();

    // Retorna o dano da arma equipada
    int getDano();

    // Retorna o alcance da arma equipada
    int getAlcance();

    // Sofrer dano recebido em um ataque
    void sofrerDano(int dano);

    // Retorna se o personagem ainda está vivo
    boolean estaVivo();

    // Retorna o nome do personagem (ex: "Guerreiro", "Mago")
    String getClasse();

    // Retorna a vida atual do personagem
    int getVida();

    // Atacar o inimigo (se estiver no alcance, causa dano)
    void atacar(Atacavel inimigo, int distancia);

- Atacavel -> Um método de classes: Garante que o Player e NPC podem se atacar
   //Garante que todo Atacavel sofre dano
    void sofrerDano(int dano);

    //Garante um método para saber se está vivo
    boolean estaVivo();

    //Get para saber o nome do atacavel
    String getNome();

> **Coleções:**

- Map -> Armas possui o Map **String** para identifacar o nome da arma como chave, e um Map **List** de identificar os atributos da arma [0]: Dano, [1]: Alcance

> **API:**

- Biblioteca padrão do Java **Random** java.util.random, para que a arma usada pelo **Player** e **NPC** seja aleatória.
