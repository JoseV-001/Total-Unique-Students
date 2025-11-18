# TotalUniqueStudents
Aplicação em Java que utiliza conjuntos (Set) para registrar códigos de alunos em três cursos e calcular quantos estudantes únicos existem no total. Evita duplicidade e demonstra operações de união entre conjuntos.

---

# 🏫 StudentCourseCounter — Exercício de Prática com Sets

Este é um exercício de prática em Java, feito para treinar:

* Leitura de dados via `Scanner`;
* Uso de `Set` (`HashSet`) para evitar duplicatas;
* Manipulação de coleções para contar elementos únicos.

O programa lê códigos de alunos de três cursos diferentes e mostra o total de alunos únicos entre todos os cursos.

---

## 📌 Como Usar

Ao executar, o programa pedirá:

1. Quantos alunos existem para cada curso;
2. O código de cada aluno para cada curso.

Como os códigos são armazenados em `Set`, qualquer código repetido (aluno matriculado em mais de um curso) será contado apenas uma vez.

---

## 📄 Exemplo de Entrada

```text
How many students for course A ?: 3
1001
1002
1003
How many students for course B ?: 3
1002
1004
1005
How many students for course C ?: 2
1001
1006
```

---

## ▶️ Resultado Esperado

O programa calcula o total de alunos únicos:

```text
Total Students: 6
```

---

## 🛠️ Conteúdo Praticado

* Uso de `Set` (`HashSet`) para armazenar dados únicos;
* Laços de repetição para entrada de dados;
* Métodos `add` e `addAll` para manipulação de conjuntos;
* Criação de uma classe `Student` com `equals` e `hashCode` para permitir comparação correta de objetos no `Set`.


