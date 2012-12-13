/*
 * Copyright (C) 2011-2012 Keyle
 *
 * This file is part of MyPet
 *
 * MyPet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MyPet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MyPet. If not, see <http://www.gnu.org/licenses/>.
 */

package Java.MyPet.entity.types.cavespider;

import Java.MyPet.entity.types.MyPetType;
import Java.MyPet.util.MyPetPlayer;
import Java.MyPet.entity.types.MyPet;

public class MyCaveSpider extends MyPet
{
    public MyCaveSpider(MyPetPlayer petOwner)
    {
        super(petOwner);
        this.petName = "Cave Spider";
    }

    @Override
    public MyPetType getPetType()
    {
        return MyPetType.CaveSpider;
    }

    @Override
    public String toString()
    {
        return "MyCaveSpider{owner=" + getOwner().getName() + ", name=" + petName + ", exp=" + experience.getExp() + "/" + experience.getRequiredExp() + ", lv=" + experience.getLevel() + ", status=" + status.name() + ", skilltree=" + skillTree.getName() + "}";
    }
}