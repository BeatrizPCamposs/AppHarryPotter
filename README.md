# AppHarryPotter

Aplicação desenvolvida por: Beatriz Pereira Campos e Emilynn Nogueira Calixto Zabala – 2ºDS.

O tema do nosso projeto foi sobre a saga de “Harry Potter”, onde trabalhamos com o intuito de desenvolver uma aplicação diretamente focada em atrair os grandes espectadores e fãs dessa saga, procurando levar informações e trazer diversas funcionalidades, exclusividades e entretenimento ao usuário. 
Por mais que a aplicação possua bastante funcionalidades, nós buscamos trazer facilidade de entendimento de uso do aplicativo ao usuário, introduzindo diversas imagens e caixas de texto entre as activities. Logo na inicialização da aplicação contamos com uma tela de Splash, a qual possuí um sensor de movimento durante sua execução, sendo ele o acelerômetro (o sensor acelerômetro é ativado quando o dispositivo retorna os valores captados, e caso ele seja maior que 10, ele executará a função que foi atribuída), o qual mudará de intent após o usuário “agitar” o dispositivo (sendo algo pensado inteiramente para uma melhor interação e experiencia do usuário). A tela de cadastro é executada logo após o funcionamento da tela de splash, e nela são solicitados alguns dados do usuário, para que ele consiga acessar a parte interna do aplicativo, sendo dados básicos para criar um login, como: nome, criação e confirmação de senha, os quais irão ser armazenados externamente, no banco de dados local SQLite.

Ademais, se o usuário já possuir um cadastro ele pode apertar o botão que se encontra na tela de cadastro com a mensagem “Já sou Cadastrado”, e será automaticamente redirecionada a tela de login, onde terá apenas que informar o seu nome de usuário e senha (os quais caso não sejam validados, não permitiram que o tal acesse a parte interna do app, exibindo uma mensagem informando o erro), após inserir seu login o usuário terá acesso a página home, a qual é possuinte de diversas seções de interatividade, tais como:

- Filmes: é atribuído uma activity para cada filme (sendo 7 no total), onde são exibidos resumos e trailer sobre o tal, contento também um button em cada uma delas, o qual possuí o método de intent explícita, direcionando o usuário para um site na web, onde ele poderá assistir o filme completo.
- Personagens: é atribuído uma activity para cada um dos principais personagens dos respectivos filmes (ao todo contamos com 4 activities), descrevendo características e outras informações relevantes a ele.

Todas as activities possuem um button no canto superior da tela, direcionando o usuário ao menu, onde ele tem acesso à algumas outras activities que apresentam o uso da intente implícita e permissão dentre sua execução, sendo elas as activities de:
- Localização: nela é necessário que o usuário permita que seja localizado o dispositivo atual. Após isso o usuário pode acessar a tela de localização, a qual apresenta um button, que ao apertá-lo será diretamente direcionado para algum aplicativo que use um mapa no dispositivo, ficando a critério de escolha do usuário seu local de execução.

- Contato: nela o usuário pode enviar uma mensagem de sugestão ou crítica sobre a aplicação. Ela apresenta uma tela de inserção de dados, onde é solicitado que o usuário informe seu nome, e-mail (para que possa receber uma resposta) e deixe sua mensagem. Ao aperta no botão enviar, suas respostas serão armazenadas internamente na aplicação com o uso do Saved Instance, além de possuir um button "exibir”, que permite que o usuário visualize o que foi armazenado.

Outro ponto relevante a ser destacado é o uso do Shared Preferences no salvamento do mode Night and Light, que pode ser visualizado na página de cadastro, sendo apresentado por um switch button, que permite o usuário a escolher o modo que prefere.

Link de acesso ao vídeo explicando o funcionamento da aplicação: https://youtu.be/7GsugnPouL0 
