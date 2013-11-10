/*
 * Copyright (C) 2013 Fabrizio Lungo <fab@lungo.co.uk> - All Rights Reserved
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 *
 * Created by Fabrizio Lungo <fab@lungo.co.uk>, November 2013
 */
package me.flungo.bukkit.plotme.abstractgenerator;

/**
 *
 * @author Fabrizio Lungo <fab@lungo.co.uk>
 */
public class BlockRepresentation {

    private final Short id;
    private final Byte value;

    public BlockRepresentation(short id, byte value) {
        this.id = id;
        this.value = value;
    }

    public static BlockRepresentation getBlockRepresentation(String idvalue) {
        return new BlockRepresentation(getBlockId(idvalue), getBlockValue(idvalue));
    }

    public static short getBlockId(String idvalue) {
        if (idvalue.indexOf(":") > 0) {
            return Short.parseShort(idvalue.split(":")[0]);
        } else {
            return Short.parseShort(idvalue);
        }
    }

    public static byte getBlockValue(String idvalue) {
        if (idvalue.indexOf(":") > 0) {
            return Byte.parseByte(idvalue.split(":")[1]);
        } else {
            return 0;
        }
    }

    public Short getId() {
        return id;
    }

    public Byte getValue() {
        return value;
    }

    public String getBlockIdValue() {
        return (value == 0) ? id.toString() : id.toString() + ":" + value.toString();
    }

}
