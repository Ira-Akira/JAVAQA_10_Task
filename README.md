# Задание 1 — обязательное
В рамках проекта по созданию «Умного дома» у нас появился очень важный клиент, который хочет кастомную доработку: он очень любит радио, поэтому нам нужно научиться управлять радио.

Что нужно сделать: по аналогии с кондиционером создайте класс ```Radio```, в котором храните следующие поля — данные, которые будут помнить о себе объекты радио:

* номер текущей радиостанции,
* громкость звука.

Требования к работе с радиостанциями

1. Номер текущей радиостанции может принимать значения только в пределах от 0 до 9.
2. Если текущая радиостанция 9 и клиент нажал на кнопку next (=вызвал одноимённый метод next, с англ. — следующая) на пульте, то текущей должна стать нулевая. В остальных случаях при нажатии на эту же кнопку радио переключается просто на следующую станцию.
3. Если текущая радиостанция 0 и клиент нажал на кнопку prev (=вызвал одноимённый метод prev, с англ. — предыдущая) на пульте, то текущей должна стать девятая. В остальных случаях радио переключается просто на предыдущую станцию.
4. Клиент должен иметь возможность выставлять номер радиостанции через прямое указание её номера. Для этого подойдёт один обычный метод-сеттер с проверкой на допустимость номера станции.

Требования к работе с уровнем громкости звука

1. Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 100.
2. Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + (=вызов метода увеличения громкости на один, придумайте название сами) не должно ни к чему приводить.
3. Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - (=вызов метода уменьшения громкости на один, придумайте название сами) не должно ни к чему приводить.

Пример реализации метода увеличения звука на 1. Остальные методы переключения на 1 текущей станции или звука сделайте самостоятельно по аналогии:

```
public class Radio {
  ...
  
  public void increaseVolume() {
    if (currentVolume < 100) {
      currentVolume = currentVolume + 1;
    }
  }
}
```

К созданному классу ```Radio``` напишите тесты, добейтесь покрытия на 100% по бранчам, обрушать сборку по покрытию при этом не нужно. То есть настройте проект в режиме генерации отчётов. Для хорошего тестирования рекомендуем вам провести тест-дизайн перед написанием тестов, так вы с большей вероятностью найдёте дефекты в вашем коде.
