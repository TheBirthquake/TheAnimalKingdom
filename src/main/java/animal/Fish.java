package animal;

import characteristic.Spine;
import characteristic.Water;

public class Fish extends Animal implements Spine, Water {
    /* Рыба
    Класс является абстрактным, а не конкретным для возможности добавления новых рыб с сохранением иерархии.
     */
}