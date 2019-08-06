# Instru��es para configurar o repositorio de git usando o terminal

Passo 1. Abra o terminal, v� at� a pasta que ser� armazenada o c�digo.

Passo 2. Escrever:
```
git clone  https://github.com/ianbandrade/TISII.git
```

Passo 3. Uma pasta chamada TISII ser� criada no seu diret�rio atual.
Escrever:
```
cd TISII
```

Passo 4. Mude seu branch atual para dev.
Escrever:
```
git checkout dev
```

Nesse momento voc� estar� no branch que vai conter o nosso c�digo. Para cada tarefa voc� deve criar um branch a partir do branch dev.  
Exemplo: Imagine que trabalhe na tarefa x. Voc� deve criar um branch novo.
Escreva:  
```
git checkout -b feature/sprint1-nome_da_tarefa (observar que tem que ser o nome da brach da tarefa que escolheu no trello)
obs2: observar que no t�tulo est� sprint 1 porques estamos na 1a. Mas quando for fazer a sprint seguinte deve colocar a qual numero ela se refere.
```

Passo 5. Depois que terminar a tarefa, deve enviar o c�digo para o reposit�rio na nuvem e depois retornar para o branch dev.
Escreva:
```
git add *
git commit -m "mensagem descrevendo o que foi realizado"
git push origin feature/sprint1-nome_da_tarefa (observar que tem que ser o nome da brach que vc criou no passo 4)
```

```
git checkout dev (muda para branch dev)
git pull origin dev (atualiza branch local com as �ltimas mudan�as, se houverem)
git merge feature/sprint1-nome_da_tarefa (observar que tem que ser o nome da brach que vc criou no passo 4)
```