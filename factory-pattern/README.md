## Folder Structure

```
abstract class 和 interface 的區別

1. 定義的語意不同
 - abstract class：

 - 抽象類是"什麼是"（"is-a"）的設計，表示一個類型的核心屬性，並且可以包含通用行為的實現。
 - 它用於描述一組共享的行為和狀態，並允許子類繼承這些行為和狀態。
 - 抽象類可以包含實例變數（如 name）、方法的實現以及抽象方法。

 ------
 - interface：

 - 接口是"能做什麼"（"can-do"）的設計，用於描述一組行為的規範。
 - 它不能包含實例變數（在 Java 8 之前），而是強調行為的定義（規範），並且通常用來實現多態。
 - Java 8 引入了 default 和 static 方法，使接口可以有部分方法實現，但它們的主要目的是擴展已有接口，而不是用來描述共享行為。
```
#### Abstract
-- Coffee Shop System

#### Interface
-- GUI System