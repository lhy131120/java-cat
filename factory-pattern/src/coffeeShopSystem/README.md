## Coffee System 

```
└── 📁coffeeShopSystem
    └── Cappuccino.java
    └── Coffee.java
    └── CoffeeFactory.java
    └── CoffeeShop.java
    └── CoffeeType.java
    └── Espresso.java
    └── Latte.java
    └── README.md
```

##### Coffee.java 
<small>Coffee 是所有咖啡類型的抽象基類，定義了模板方法來統一製作流程。</small>

##### Espresso.java, Cappuccino.java, Latte.java
<small>繼承 Coffee，並實現自己的配料步驟。</small>

##### CoffeeType.java (Enum)
<small> - 負責創建該類型的咖啡對象。 <br> 實現了 createCoffee() 方法，返回對應的咖啡類型。</small>
<small> - 新增咖啡類型時，只需在 CoffeeType 中添加新的枚舉常量及其實現即可。</small>

##### CoffeeFactory.java
<small>通過 CoffeeType 的 createCoffee 方法創建咖啡</small>

##### CoffeeShop.java
<small>使用Factory Pattern和Enum來訂購咖啡。</small>

---

需求: 
1. 咖啡類型：
    - 咖啡店可以製作以下幾種咖啡：
      - Espresso：濃縮咖啡。
      - Cappuccino：卡布奇諾咖啡。
      - Latte：拿鐵咖啡。

2. 咖啡的製作步驟：
    - 每種咖啡有相同的製作步驟：
      1. 磨咖啡豆。
      2. 煮咖啡。
      3. 倒入杯中。
      4. 添加特定配料（每種咖啡的配料不同）。
    - 不同類型的咖啡有不同的配料：
      - Espresso：無額外配料。
      - Cappuccino：添加奶泡。
      - Latte：添加牛奶。
3. 設計要求：
    - 使用 工廠模式 設計系統，讓客戶端只需要與咖啡店交互，而不用關心具體的咖啡製作過程。
    - 新增咖啡類型時，應盡量減少對現有代碼的修改（符合 開放封閉原則）。
4. 輸出：
    - 每種咖啡在製作完成後，輸出該咖啡的名稱和製作步驟。
---
#### Expert Result
```
Espresso
Grinding coffee beans...
Brewing coffee...
Pouring into cup...
Espresso is ready!

Cappuccino
Grinding coffee beans...
Brewing coffee...
Pouring into cup...
Adding milk foam...
Cappuccino is ready!

Latte
Grinding coffee beans...
Brewing coffee...
Pouring into cup...
Adding milk...
Latte is ready!
```
---