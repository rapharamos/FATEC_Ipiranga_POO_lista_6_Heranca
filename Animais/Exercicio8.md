É um problema de herança múltipla.
Quando uma classe é herdeira de duas casses, que por sua vez são herdeiras de uma mesma classe.
Isso ocorre no estudo de classes dos animais.
Ornitorrinco herdaria Mamífero e Ovípero.
Essas duas classes são herdeiras de Animal.
Isso gera uma ambiguidade quando for construir um objeto.
Quando construir Ornitorrinco, teria que construir Mamífero e Ovípero.
Por sua vez, Mamífero e Ovípero vão gerar duas construções de Animal.