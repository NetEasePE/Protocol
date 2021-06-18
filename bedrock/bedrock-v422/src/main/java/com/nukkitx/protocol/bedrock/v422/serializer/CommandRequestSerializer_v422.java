package com.nukkitx.protocol.bedrock.v422.serializer;

import com.nukkitx.protocol.bedrock.BedrockPacketHelper;
import com.nukkitx.protocol.bedrock.packet.CommandRequestPacket;
import com.nukkitx.protocol.bedrock.v291.serializer.CommandRequestSerializer_v291;
import io.netty.buffer.ByteBuf;

public class CommandRequestSerializer_v422 extends CommandRequestSerializer_v291 {
    public static final CommandRequestSerializer_v422 INSTANCE = new CommandRequestSerializer_v422();

    @Override
    public void serialize(ByteBuf buffer, BedrockPacketHelper helper, CommandRequestPacket packet) {
        super.serialize(buffer, helper, packet);
        buffer.writeByte(packet.getSecretField0());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockPacketHelper helper, CommandRequestPacket packet) {
        super.deserialize(buffer, helper, packet);
        packet.setSecretField0(buffer.readByte());
    }
}
