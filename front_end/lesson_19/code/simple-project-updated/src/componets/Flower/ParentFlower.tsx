import React from 'react';
import Flower from '../../types/Flower';
import FlowerCard from './FlowerCard';

function ParentFlower(): JSX.Element {
    const rose: Flower = {
        color: "red",
        title: "red rose",
        family: "some family of roses",
        price: 20
    }

    const sunFlower: Flower = {
        color: "yellow",
        title: "sun flower",
        family: "some family of flowers",
        price: 2
    }

    return (
        <div>
            <FlowerCard flower={rose}/>
            <FlowerCard flower={sunFlower}/>
        </div>
    );
}

export default ParentFlower;