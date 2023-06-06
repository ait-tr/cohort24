import React from 'react';
import Flower from '../../types/Flower';

interface FlowerProps {
    flower: Flower
    // eslint-disable-next-line react/no-unused-prop-types, react/require-default-props
    hasOwner?: boolean
}

function FlowerCard({ flower }: FlowerProps):JSX.Element {
    // деструктурируем - вытаскиваем свойства из объекта
    const {
 color, title, family, price
} = flower;

    return (
        <div>
            <h5>Flower</h5>
            <p style={{ backgroundColor: color }}>Color: {color}</p>
            <p>Title: {title}</p>
            <p>Family: {family}</p>
            <p>Price: {price}</p>
        </div>
    );
}

export default FlowerCard;
