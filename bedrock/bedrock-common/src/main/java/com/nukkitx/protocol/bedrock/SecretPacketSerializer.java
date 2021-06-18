package com.nukkitx.protocol.bedrock;

import io.netty.buffer.ByteBuf;

public interface SecretPacketSerializer<T extends SecretPacket> extends BedrockPacketSerializer<T> {

    @Override
    default void serialize(ByteBuf buffer, BedrockPacketHelper helper, T packet) {
        buffer.writeBytes(packet.getData());
    }

    @Override
    default void deserialize(ByteBuf buffer, BedrockPacketHelper helper, T packet) {
        byte[] data = new byte[buffer.readableBytes()];
        buffer.readBytes(data);
        packet.setData(data);
    }
}
