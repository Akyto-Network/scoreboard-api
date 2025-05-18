package com.bizarrealex.aether;

public class AetherOptions
{
    private boolean hook;
    private boolean scoreboardDirectionDown;
    
    static AetherOptions defaultOptions() {
        return new AetherOptions().hook(false).scoreboardDirectionDown(false);
    }
    
    public boolean hook() {
        return this.hook;
    }
    
    public boolean scoreboardDirectionDown() {
        return this.scoreboardDirectionDown;
    }
    
    public AetherOptions hook(final boolean hook) {
        this.hook = hook;
        return this;
    }
    
    public AetherOptions scoreboardDirectionDown(final boolean scoreboardDirectionDown) {
        this.scoreboardDirectionDown = scoreboardDirectionDown;
        return this;
    }
}
