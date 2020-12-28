package com.nukkitx.protocol.bedrock;

public abstract class SecretPacket extends BedrockPacket {

    public abstract byte[] getData();

    public abstract void setData(byte[] data);
}
