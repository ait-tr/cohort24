import Color from "./types/Color";

export async function save(count: number): Promise<void> {
    console.log(`Count ${count} saved`);
    // fetch
}

export async function colorChange(color: Color): Promise<void> {
    console.log(`Color ${color} changed`);
    // fetch
}