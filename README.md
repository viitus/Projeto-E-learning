# 📚 E-Learning - Sistema de Gestão de Cursos

Este projeto é um sistema desktop desenvolvido em **Java (Swing)** para auxiliar no gerenciamento de cursos, usuários e aulas. Ele simula uma plataforma educacional simples, com interface gráfica amigável, focada em facilitar o controle de conteúdo e acesso de usuários.

## 🚀 Funcionalidades

- 🔐 **Login de usuário** com autenticação (aluno ou administrador)
- 👤 **Cadastro e gerenciamento de usuários**
- 📘 **Cadastro e gerenciamento de cursos**
- 📅 **Criação e listagem de aulas para cada curso**
- 📝 Interface gráfica com layout padronizado
- 💾 **Persistência de dados em arquivos JSON** utilizando a biblioteca GSON

## 🧱 Estrutura do Projeto
E-Learning/

├── Controller/

│ ├── CursoController.java

│ └── UsuarioController.java

├── Model/

│ ├── Aluno.java

│ ├── Aula.java

│ ├── Curso.java

│ └── Usuario.java

├── Util/

│ └── PersistenciaJson.java

├── View/

│ ├── TelaBase.java

│ ├── TelaLogin.java

│ ├── TelaInicial.java

│ ├── TelaCursos.java

│ ├── TelaListaAulas.java

│ ├── TelaCriarAula.java

│ ├── TelaGerenciarCursos.java

│ └── TelaCriaUsuario.java

└── Main.java


## 💡 Tecnologias Utilizadas

- Java SE
- Swing (GUI)
- GSON (para leitura e escrita em JSON)
- NetBeans IDE

## 📁 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/viitus/Projeto-E-Learning.git
   
2. Abra o projeto no NetBeans.

2. Execute o arquivo Main.java.

4. Os arquivos de persistência serão lidos e carregados automaticamente a partir de cursos.json e usuarios.json.

👨‍💻 Autor
Desenvolvido por Victor Dias Frota como parte do aprendizado em desenvolvimento Java e sistemas de gerenciamento educacional.
